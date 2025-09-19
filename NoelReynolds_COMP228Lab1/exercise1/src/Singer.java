import java.time.LocalDate;
import java.time.Month;

public class Singer
{
    private String singerId;
    private String singerName;
    private String singerAddress;
    //Didn't know if I should use a String for simplicity or mess around with this
    //private Date singerBirthday;
    //Changed to SimpleDateFormat since looking up information about it mostly calls back to this
    //private SimpleDateFormat singerBirthday;
    //Switched to LocalDate for an even simpler representation (since the formatting is... interesting on the other two)
    private LocalDate singerBirthday;
    private int singerAlbums;

    public Singer()
    {
        this.singerId = "Unknown ID";
        this.singerName = "Unknown Singer";
        this.singerAddress = "Unknown Address";
        this.singerBirthday = LocalDate.of(0, Month.JANUARY,1);
        //Hopefully I formatted that correctly...
        this.singerAlbums = 0;
    }

    public Singer(String id, String name, String address, LocalDate birthday, int albums)
    {
        this.singerId = id;
        this.singerName = name;
        this.singerAddress = address;
        this.singerBirthday = birthday;
        this.singerAlbums = albums;
    }

    public void setId(String id) {this.singerId = id; }
    public void setName(String name) {this.singerName = name; }
    public void setAddress(String address) {this.singerAddress = address; }
    public void setBirthday(LocalDate birthday) {this.singerBirthday = birthday; }
    public void setAlbums(int albums) {this.singerAlbums = albums; }

    public void setSingerStats(String id, String name, String address, LocalDate birthday, int albums)
    {
        this.singerId = id;
        this.singerName = name;
        this.singerAddress = address;
        this.singerBirthday = birthday;
        this.singerAlbums = albums;
    }

    public String getId() { return singerId; }
    public String getName() { return singerName; }
    public String getAddress() { return singerAddress; }
    public LocalDate getBirthday() { return singerBirthday; }
    public int getAlbums() { return singerAlbums; }
    //I would've named this getTotalAlbums, but I wanted to keep the naming convention above
}
