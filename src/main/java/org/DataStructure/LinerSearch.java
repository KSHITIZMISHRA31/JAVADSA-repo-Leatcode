package org.DataStructure;

public class LinerSearch {
    int arr[]={};
    LinerSearch(int arr[]){
        this.arr = arr;
    }
    public int findval(int target){
        for(int i = 0; i<this.arr.length ; i++){
            if(target == this.arr[i]){
                return i;
            }
        }
        return -1;
    }
}
