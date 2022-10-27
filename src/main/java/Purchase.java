public class Purchase {
    protected String title;
    protected int count;


    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

// разделяем логику формирования одной покупки(Purchase) и заполнения корзины(Basket) на два класса,
// в соответствии с принципом единственной ответственности