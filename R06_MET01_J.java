public static int getAbsAdd(int x, int y) {
    assert x != Integer.MINVALUE;
    assert y != Integer.MINVALUE;
    int absX = Math.abs(x);
    int absY = Math.abs(y);
    assert (absX <= Integer.MAXVALUE − absY);
    return absX + absY;
}
// Usage: getAbsAdd(Integer.MINVALUE, 1);
