void printDetails(double outst) {
        // Print details.
        System.out.println("name: " + name);
        System.out.println("amount: " + outst);
}
void printOwing() {
  printBanner();

  printDetails(getOutstanding());
}