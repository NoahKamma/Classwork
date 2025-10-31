
public class Door {

private int doorNum = 0;
private boolean isPrizeDoor = false;
private boolean isChosenDoor = false;
private int doorPrizeNum = 0;
/*
 * Placeholder for door number
 */
	public Door(int doorNum)
	{
		this.doorNum = doorNum;
	}

	public boolean getPrize()
	{
		if(isPrizeDoor==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void setPrize()
	{
		isPrizeDoor = true;
	}
	
	public boolean setChosen()
	{
		isChosenDoor = true;
		doorPrizeNum = doorNum;
		return isChosenDoor;
	}
	
	public int getNum()
	{
		return doorNum;
		
	}
	
	public boolean getChosen()
	{
		return isChosenDoor;
	}
	
	public int prizeNum()
	{
		return doorPrizeNum;
	}
	
}
