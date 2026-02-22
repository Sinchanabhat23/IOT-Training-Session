package singlenumber;
 class SingleNumber {
public int SingleNumber(int[] nums)
{
    int res=0;
    for(int i=0;i<nums.length;i++)
    {
        res=res^nums[i];
    }
        return res;
}
    public static void main(String[] args) {
        int nums[]={2,3,3,2,9};
        SingleNumber sn=new SingleNumber();
        int solution=sn.SingleNumber(nums);
        System.out.println("Single number is "+solution);
    }
}