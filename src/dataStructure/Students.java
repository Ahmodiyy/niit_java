package dataStructure;

public class Students
{
    private String name;
    private int marks;

    public Students(String nm, int mk)
    {
        this.name = nm;
        this.marks = mk;
    }

    public int getMarks()
    {
        return marks;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Name: "+ name +"\n");
        buffer.append("Marks: " + marks + "\n");
        return buffer.toString();
    }
}

