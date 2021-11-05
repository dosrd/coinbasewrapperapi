# Coinbase Wrapper API
##A wrapper for coinbase api for trading and point of sale integration
  // String coinsecret = "EP01PgS9RvSXYlO49f3kQeqqtaZ3qhqG";
  ```
 CoinbaseCredentials cc = new CoinbaseCredentials(SECRET, API_KEY);
 CoinbaseCallWrappers ccc = new CoinbaseCallWrappers(cc);
 System.out.println(ccc.createBitcoinAddress("Test Account"));
