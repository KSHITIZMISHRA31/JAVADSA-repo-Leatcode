package org.main;

//;TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//class TNode<T> {
//    T data;
//    Node<T> next;
//
//    public TNode(T data) {
//        this.data = data;
//    }
//}

//public class Solution {
//    public static TNode<Integer> evenAfterOdd(TNode<Integer> head) {
//        //Your code goes here
//        Node<Integer> odd = head;
//        Node<Integer> even = head;
//        Node<Integer> curr = head;
//        Node<Integer> temp = new Node<Integer>
//        if(head==null){
//            return head;
//        }
//        while(curr != null){
//            if((curr.data)%2 ==0){
//                even = curr;
//            }
//        }
//        return head ;
//    }
//}

import org.DataStructure.Data_Structure_Manager;

import java.sql.*;
import java.util.*;

public class Main {

    public static void callAlgorithms(){
        Data_Structure_Manager lLinked_obj = new Data_Structure_Manager();
        System.out.println("-----------------Normal Linked List Working-----------------");
        lLinked_obj.linkedListWrking();
        System.out.println("-----------------Normal Doubly Linked List Working-----------------");
        lLinked_obj.doublyLinkedListwrking();
        System.out.println("-----------------Stack Implementation through Linked List-----------------");
        lLinked_obj.LinkedStackWrking();
        System.out.println("-----------------Stack Implementation through Array-----------------");
        lLinked_obj.arrayStackWrking();
        System.out.println("-----------------Queue Implementation through Linked List-----------------");
        lLinked_obj.arrayQueueWrking();
        System.out.println("-----------------Queue Implementation through doubly Linked List-----------------");
        lLinked_obj.doublyLinkedListQueuewrking();
        System.out.println("-----------------Binary Search Tree Implementation-----------------");
        lLinked_obj.BSTreeImpl();
    }

    public static void callJDBCconnectionLearning(){
        String sql = "SELECT \"NAME\" FROM public.\"STUDENTS\" where \"ROLLNUMBER\" = 1008";
        String url = "jdbc:postgresql://localhost:5432/Demo_DB";

        String username = "postgres";
        String password = "0000";
        String name="no";
        try{
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            name = rs.getString(1);
        } catch (SQLException e) {
            System.out.println(e);
        }

        System.out.println("sucess");
        System.out.println(name);

    }

    public static String largestOddNumber(String num) {

        int len = num.length();
        for(int i = len-1; i>=0;i--){
            if((int)num.charAt(i) % 2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }

    public static String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        String rus;
        for(int i = 1;i<strs.length;i++){
            rus = "";
            for(int j = 0 ;j < res.length() && j < strs[i].length(); j++){
                //System.out.println(j+":"+res.charAt(j) +" : "+ strs[i].charAt(j));
                if(res.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                rus = rus + strs[i].charAt(j);
                //System.out.println("Res : "+res);
            }
            if(rus.length()<res.length()){
                res = rus;
            }
        }
        return res;
    }

    public static boolean rotateString(String s, String goal) {
//        this will take more time optimized aproach
//        String doubl = s + s ;
//        return doubl.contains(goal);
//

        System.out.println(s+" : "+goal);
        int lens = s.length();
        int leng = goal.length();
        int j;
        int flag = 0;
        if(lens != leng){
            return false;
        }
        for(int i = 0 ; i<lens ; i++){
            System.out.println("value S : "+s.charAt(i));
            j=0;
            flag = 0;
            while (j<leng ){
                if (goal.charAt(j)!=s.charAt((j+i)%leng)){
                    flag = 1;
                }
                j++;
            }
            if(j>= leng && flag == 0){
                return true;
            }
        }
        return true;



    }

    public static boolean isAnagram(String s, String t) {
        System.out.println(s+" : "+t);
        int[] arr = new int[26];
        for(char c: s.toCharArray()){
            ++arr[(int)c-97];
        }
        for(char c: t.toCharArray()){
            --arr[(int)c-97];
        }
        for(int i = 0;i<arr.length;i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[256]; // maps s -> t
        int[] mapT = new int[256]; // maps t -> s

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapS[c1] == 0 && mapT[c2] == 0) {
                mapS[c1] = c2;
                mapT[c2] = c1;
            } else {
                if (mapS[c1] != c2 || mapT[c2] != c1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String frequencySort(String s) {
        String res = "";
        HashMap<Character,Integer> hmap = new HashMap<>();
        PriorityQueue<Character> que = new PriorityQueue<Character>();
        int val = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!hmap.containsKey(c)) {
                hmap.put(c, 1);
            } else {
                val = hmap.get(c);
                hmap.put(c, val + 1);
            }
        }
        for(char c : hmap.keySet()){

        }

        System.out.println(que);
        System.out.println(hmap.values()+" : "+hmap.keySet());

        return res;
    }

    public static int bSearchLoop(int[] nums, int low1, int high1, int target){
        System.out.println("Entering Inside bSearchLoop(int[] nums, int low1, int high1, int target)");
        int low = low1;
        int high = high1;

        while(low<high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static int bSearch(int[] nums, int low1, int high1, int target){
        System.out.println("Entering Inside bSearch(int[] nums, int low1, int high1, int target)");
        int low = low1;
        int high = high1;
        int mid = low + (high-low)/2;
//        System.out.println(low+" "+high+" "+mid);
        if(low>high){
            return -1;
        }
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid]>target){
            return bSearch(nums , low , mid-1, target);
        }
        else{
            return bSearch(nums,mid+1, high, target);
        }
    }

    public static int binarySearch(int[] nums, int target){

        System.out.println(bSearch(nums,0, nums.length-1, target));

        System.out.println(bSearchLoop(nums,0, nums.length-1, target));
        return -1;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int val = nums.length;
        int[] arr = new int[val+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        List<Integer> ls = new ArrayList<>();

        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                ls.add(i);
            }
        }

        return ls;
    }

    public static int maxDepth(String s) {

        int max = 0;
        int val = 0;
        for(int i = 0 ; i < s.length() ;i++){
            if ('(' == (s.charAt(i))){
                val++;
            }
            else if( ')' == s.charAt(i)){
                val--;
            }
        }
        System.out.println(val);
        return val;
    }

    public static int romanToInt(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        mp.put('M',1000);mp.put('D',500);mp.put('C',100);
        mp.put('L',50);mp.put('X',10);mp.put('V',5);mp.put('I',1);

        int sum = 0;
        for(int i=0;i<s.length();i++){
            if(s.length()-1 == i){
                sum = sum+mp.get(s.charAt(i));
            }
            else if(mp.get(s.charAt(i))<mp.get(s.charAt(i+1))){
                sum = sum - mp.get(s.charAt(i));
            }
            else{
                sum = sum + mp.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static int myAtoi(String s) {
        System.out.println(s);
        int x = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!= ' '){
                x=i;
                break;
            }
        }
        int sign = 1;
        if('-' == s.charAt(x++)){
            sign = -1;
        }
        double num = 0;
        for(int i = x ; i<s.length();i++){

            if(Character.isDigit(s.charAt(i))){
                num = num*10 + ((int)(s.charAt(i))-48);
            }
            else{
                break;
            }
        }
        num = sign*num;
        if(num < -2147483648){
            return Integer.MAX_VALUE;
        }
        else if(num > 2147483647){
            return Integer.MAX_VALUE;
        }
        return (int)num;
    }

    public static boolean isValid(String s) {
        System.out.println(s);
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < s.length(); i++){
            switch (s.charAt(i)){
                case '(':
                    st.push(')');
                    break;
                case '{':
                    st.push('}');
                    break;
                case '[':
                    st.push(']');
                    break;
                default:
                    if(st.peek() == (s.charAt(i))){
                        st.pop();
                        System.out.println("wow same same");
                    }
                    break;
            }
        }

        return st.isEmpty();
    }

//    class TreeNode{
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//    };
//    public static List<List<Integer>> levelOrder(TreeNode root) {
//
//        List<List<Integer>>  ls = new ArrayList<>();
//        Queue<TreeNode> qu = new LinkedList<>();
//        if(root == null){
//            return ls;
//        }
//        qu.offer(root);
//        while(!qu.isEmpty()){
//            int levnum = qu.size();
//            List<Integer> subls = new ArrayList<>();
//            for(int i = 0 ; i<levnum ; i++){
//                if(qu.peek().left != null)qu.offer(qu.peek().left);
//                if(qu.peek().right != null)qu.offer(qu.peek().right);
//                subls.add(qu.poll().val);
//            }
//            ls.add(subls);
//        }
//        return ls;
//    }

    public static void leatcode(){


        //String val = largestOddNumber("142180");
        //System.out.println(val)
        //String[] strs = {"ab", "a"};
        //String[] strs = {"flower","flow","flight"};
        // val = longestCommonPrefix(strs);
        //boolean val = rotateString("defdefdefabcabc", "defdefabcabcdef");
        //boolean val = isAnagram("anagram","nagaram");
        //boolean val = isIsomorphic( "badc","baba");
        //String val = frequencySort("treeE");

//        int[] num = {0,1,2,3,5,6,8,10,12};
//        val = binarySearch( num , 8);
//        System.out.println(val);
        //int[] val = {4,3,2,7,8,2,3,1};

        //String val = "(1+(2*3)+((8)/4))+1";
        //String val = "MCMXCIV";
        //String val = " -042a";
        String val = "[()()(){}]";
        System.out.println(isValid(val));

    }

    public static void main(String[] args) {
        callAlgorithms();

//       callJDBCconnectionLearning();
//        leatcode();

    }
}