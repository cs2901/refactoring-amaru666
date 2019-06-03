public double getPayAmount() {
  double result;
  if (isDead){
    return result = deadAmount();
  }

  if (isSeparated){
      return result = separatedAmount();
  }

  if (isRetired){
    return result = retiredAmount();
  }
  return     result = normalPayAmount();

}