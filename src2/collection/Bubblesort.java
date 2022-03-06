package collection;
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x= in.nextInt();
    int n= in.nextInt();
    int[] list = new int[x];
    list[0]=1;
    int temp=(int)Math.pow(x,1.0/n);
    for(int i = 1; i<=temp ;i++){
        int u = (int)Math.pow(i,n);
        for(int j=x-1;j>u-1;j--)
            list[j]+=list[j-u];
    }
    System.out.println(list[x-1]);
}