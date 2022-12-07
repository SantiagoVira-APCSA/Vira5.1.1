public class Prism {
    private int length, width, height;

    public Prism(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    public Prism(int len) {
        length = len;
        width = len;
        height = len;
    }

    public Prism() {
        length = 10 + (int) (Math.random() * 91);
        width = 10 + (int) (Math.random() * 91);
        height = 10 + (int) (Math.random() * 91);
    }

    public String toString() {
        return "Length: %d\nWidth: %d\nHeight: %d".formatted(length, width, height);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int volume() {
        return length * width * height;
    }

    public int surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }
}
