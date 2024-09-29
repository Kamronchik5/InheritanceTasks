public class Computers extends Electronics{

    private String name;

    public String getType() {
        return name;
    }

    public void setType(String name) {
        System.out.println(this.name = name);
    }

}
