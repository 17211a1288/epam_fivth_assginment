package logging_assigment;

public class Houseconstruction {
	int materialstandard,totalarea,isautomated,ans;
	Houseconstruction(int materialstandard,int totalarea,int isautomated)
	{
		this.materialstandard=materialstandard;
		this.totalarea=totalarea;
		this.isautomated=isautomated;
	}
	public int costofhouse()
	{
		if(materialstandard==1 && isautomated==0)
		{
			ans=(12000*totalarea);
		}
		else if(materialstandard==2 && isautomated==0)
		{
			ans=(15000*totalarea);
		}
		else if(materialstandard==3 && isautomated==0)
		{
			ans=(18000*totalarea);
		}
		else if(materialstandard==4 && isautomated==1)
		{
			ans=(25000*totalarea);
		}
		return ans;
	}
}
