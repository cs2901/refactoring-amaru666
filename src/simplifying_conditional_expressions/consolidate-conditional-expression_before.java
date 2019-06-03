double disabilityAmount() {
  final boolean p = seniority < 2;
  final boolean q = monthsDisabled > 12;

  if (p && q && isPartTime) {
    return 0;
  }

  // Compute the disability amount.
  // ...
}