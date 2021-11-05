# Coinbase Wrapper API
##A wrapper for coinbase api for trading and point of sale integration
   
  ```
 CoinbaseCredentials cc = new CoinbaseCredentials(SECRET, API_KEY);
 CoinbaseCallWrappers ccc = new CoinbaseCallWrappers(cc);
 System.out.println(ccc.createBitcoinAddress("Test Account"));
