

void setValue(String name, int value) {
  if (name.equals("height")) {
    height = value;
    return;
  }
  if (name.equals("width")) {
    width = value;
    return;
  }
  Assert.shouldNeverReachHere();
}

void setHeight(int  h) {
    height = h;

        };

void setWidth(int w) {
     width = w;
        };