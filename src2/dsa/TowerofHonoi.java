package dsa;

/*
    Time Complexity: O(2 ^ N)
    Space Complexity: O(N)

    Where 'N' is the number of disks.
*/

import java.util.ArrayList;

public class TowerofHonoi
{
   private static void moveDisks(int n, int toRod, int fromRod, ArrayList < ArrayList<Integer>> moves) 
    {
        
        //    If there is only one disk move that disk
        if (n == 1) 
        {
            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans.add(fromRod);
            ans.add(toRod);
            moves.add(ans);
            return;
        }

        //    Value of rem rod can be calculated by simply xoring number of each rod and toRod and fromRod.
        int rem = 1 ^ 2 ^ 3 ^ toRod ^ fromRod;

        //    Move the top n-1 to the rem rod.
        moveDisks(n - 1, rem, fromRod, moves);

        //    Move the n'th disk to toRod.
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(fromRod);
        ans.add(toRod);
        moves.add(ans);

        //    Move the n-1 disks from rem rod to toRod.
        moveDisks(n - 1, toRod, rem, moves);
    }

    public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
    {
        //    For storing the moves.
        ArrayList < ArrayList<Integer>> moves = new ArrayList<ArrayList<Integer>>();

        moveDisks(n, 2, 1, moves);

        //    Return the stored moves.
        return moves;
    }
}