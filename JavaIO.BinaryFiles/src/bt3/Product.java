package bt3;

public class Product {
    private int id;
    private String name;
    private String hangsanxuat;
    private int cost;
    private String other;

    public Product() {
    }

    public Product(int id, String name, String hangsanxuat, int cost, String other) {
        this.id = id;
        this.name = name;
        this.hangsanxuat = hangsanxuat;
        this.cost = cost;
        this.other = other;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(String hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hangsanxuat='" + hangsanxuat + '\'' +
                ", cost=" + cost +
                ", other='" + other + '\'' +
                '}';
    }
}
