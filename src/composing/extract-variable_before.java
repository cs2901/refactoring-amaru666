void renderBanner() {
  final boolean p = platform.toUpperCase().indexOf("MAC") > -1;
  final boolean q = browser.toUpperCase().indexOf("IE") > -1;
  if ( p &&
       q &&
        wasInitialized() && resize > 0 )
  {
    // do something
  }
}