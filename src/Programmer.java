public class Programmer {
    private String name, company, position;
    private int x;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
        this.x = 1;
    }
    public String getPosition(){
        return position;
    }
    public void work(){
        if (x == 1)
            position = "junior";
            else if (x==2)
                position = "middle";
            else if (x==3)
                position = "senior";
            else if (x==4)
                position = "lead";
            x++;
        }
    }

