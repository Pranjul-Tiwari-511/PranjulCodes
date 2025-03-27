document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('searchForm');
    const resultContainer = document.getElementById('resultContainer');
    const loadingElement = document.getElementById('loading');
    const errorElement = document.getElementById('error');
    
    let updateInterval;
    
    form.addEventListener('submit', function(e) {
        e.preventDefault();
        getCryptoData();
    });
    
    // Load data on page load
    getCryptoData();
    
    function getCryptoData() {
        // Clear any existing interval
        if (updateInterval) {
            clearInterval(updateInterval);
        }
        
        const coinType = form.elements.coinType.value;
        
        // Show loading, hide error
        loadingElement.style.display = 'block';
        errorElement.style.display = 'none';
        resultContainer.innerHTML = '';
        
        fetchPrice(coinType);
        
        // Set up auto-refresh every 10 seconds
        updateInterval = setInterval(() => fetchPrice(coinType), 10000);
    }
    
    async function fetchPrice(coinType) {
        try {
            loadingElement.style.display = 'block';
            
            // Fetch all coins data
            const response = await axios.get('https://openapiv1.coinstats.app/coins', {
                headers: {
                    'X-API-KEY': '3679c+Hot3Ku78rOM0+FDpgDuUBcKdz22HAmPXtuBxk=' 
                }
            });
            
            if (response.data && response.data.result) {
                // Find the specific coin we're looking for
                const coinData = response.data.result.find(coin => coin.id === coinType);
                
                if (coinData) {
                    displayResults(coinData);
                } else {
                    throw new Error('Coin not found in API response');
                }
            } else {
                throw new Error('Invalid data received from API');
            }
        } catch (error) {
            console.error('Error fetching crypto data:', error);
            errorElement.textContent = `Error: ${error.message || 'Failed to fetch data'}`;
            errorElement.style.display = 'block';
            resultContainer.innerHTML = '';
        } finally {
            loadingElement.style.display = 'none';
        }
    }
    
    function displayResults(coinData) {
        // Format numbers
        const formatCurrency = (value) => {
            return new Intl.NumberFormat('en-US', {
                style: 'currency',
                currency: 'USD',
                minimumFractionDigits: 2,
                maximumFractionDigits: 2
            }).format(value);
        };
        
        const formatLargeNumber = (value) => {
            return new Intl.NumberFormat('en-US', {
                maximumFractionDigits: 2
            }).format(value);
        };
        
        const formatPercentage = (value) => {
            if (value === undefined || value === null) return 'N/A';
            return `${value > 0 ? '+' : ''}${value.toFixed(2)}%`;
        };
        
        const getChangeClass = (value) => {
            if (value === undefined || value === null) return '';
            return value >= 0 ? 'positive' : 'negative';
        };
        
        resultContainer.innerHTML = `
            <table class="result-table">
                <thead>
                    <tr>
                        <th colspan="2" style="text-align: center;">
                            <img src="${coinData.icon}" alt="${coinData.name}" class="coin-icon">
                            ${coinData.name} (${coinData.symbol}) - Rank #${coinData.rank}
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Current Price</td>
                        <td>${formatCurrency(coinData.price)}</td>
                    </tr>
                    <tr>
                        <td>Price in BTC</td>
                        <td>${coinData.priceBtc?.toFixed(8) || 'N/A'}</td>
                    </tr>
                    <tr>
                        <td>24h Trading Volume</td>
                        <td>${formatCurrency(coinData.volume)}</td>
                    </tr>
                    <tr>
                        <td>Market Cap</td>
                        <td>${formatCurrency(coinData.marketCap)}</td>
                    </tr>
                    <tr>
                        <td>Available Supply</td>
                        <td>${formatLargeNumber(coinData.availableSupply)} ${coinData.symbol}</td>
                    </tr>
                    <tr>
                        <td>Total Supply</td>
                        <td>${formatLargeNumber(coinData.totalSupply)} ${coinData.symbol}</td>
                    </tr>
                    <tr>
                        <td>Price Change (1h)</td>
                        <td class="${getChangeClass(coinData.priceChange1h)}">
                            ${formatPercentage(coinData.priceChange1h)}
                        </td>
                    </tr>
                    <tr>
                        <td>Price Change (24h)</td>
                        <td class="${getChangeClass(coinData.priceChange1d)}">
                            ${formatPercentage(coinData.priceChange1d)}
                        </td>
                    </tr>
                    <tr>
                        <td>Price Change (7d)</td>
                        <td class="${getChangeClass(coinData.priceChange1w)}">
                            ${formatPercentage(coinData.priceChange1w)}
                        </td>
                    </tr>
                    ${coinData.websiteUrl ? `
                    <tr>
                        <td>Website</td>
                        <td><a href="${coinData.websiteUrl}" target="_blank">${coinData.websiteUrl}</a></td>
                    </tr>` : ''}
                </tbody>
            </table>
        `;
    }
});