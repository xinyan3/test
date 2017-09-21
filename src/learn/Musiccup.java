package learn;

class MusicCup implements Cupint
{
    public void addWater(int w) 
    {
        this.water = this.water + w;
    }

    public void drinkWater(int w)
    {
        this.water = this.water - w;
    }

    public int waterContent()
    {
        return this.water;
    }

    private int water = 0;
}