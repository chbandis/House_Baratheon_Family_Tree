package house_of_baratheon;

public class Relation {                     //Δημιουργία κλάσης Relation
    private String name1, relation, name2;

    public Relation(String name1, String relation, String name2) {
        this.setName1(name1);
        this.setName2(name2);
        this.setRelation(relation);
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String toString() {
        return name1 + "," + relation + "," + name2;
    }

}
