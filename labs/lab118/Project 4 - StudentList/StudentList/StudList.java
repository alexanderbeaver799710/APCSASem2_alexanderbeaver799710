
import java.util.ArrayList;
import java.util.*;
/**
 * Write a description of class StudList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudList
{
    ArrayList<Student> studentList = new ArrayList<Student>();


    /**
     * Constructor for objects of class StudList
     */
    public StudList()
    {

    }

    /**
     * Create a new student
     * @param firstName
     * @param lastName
     * @param middleName
     * @param studentNumber     Must be solely numeric digits
     * @param gpa   Can contain a decimal
     */
    public void addStudent(String firstName, String lastName, String middleName, int studentNumber, double gpa){
        studentList.add(new Student(firstName, lastName, middleName, studentNumber, gpa));
    }


    /**
     * Clears the entire list
     */
    public void clearList(){
        studentList.clear();
    }

    /**
     * Prints the list to the console in a tabular manner
     */
    public void printList(){
        ConsoleMethods.clearScreen();
      
        for(Student student : studentList){

            System.out.println("Name: " + student.getFullName() + " | Student ID: " + student.getStuNumber() + " | GPA: " + student.getGPA());
        }


        Scanner s = new Scanner(System.in);
        String wait = s.nextLine();
    }

    /**
     * Prints a student to the console
     * @param id
     */
    public void printStudent(int id){
        for(Student studentObject : studentList){
            if(studentObject.getStuNumber() == id){

                System.out.println("Name: "+ studentObject.getFullName());
                System.out.println("Student #: "+studentObject.getStuNumber());
                System.out.println("GPA: "+studentObject.getGPA());

            }
        }
    }
    
    /**
     * Prints the student and UI given a name
     * 
     */
    public void printStudent(String studentName){

        int indexToPrint = -1;

        for(Student student : studentList){
            System.out.println(student.getFullName() + "|" + studentName);
            if(student.getFullName().equals(studentName)){
                indexToPrint = studentList.indexOf(student);

            }
        }
        if(indexToPrint > -1){
            Student student = studentList.get(indexToPrint);

            System.out.println("Name: "+ student.getFullName());
            System.out.println("Student #: "+student.getStuNumber());
            System.out.println("GPA: "+student.getGPA());


        } else{
            System.out.println("Not Found");
        }
    }



    /**
     * Deletes a student with a given ID
     * @param studentID
     */
    public void deleteStudent(int studentID){
        int indexToRemove = -1;
        for(Student student : studentList){
            if(student.getStuNumber() == studentID){
                indexToRemove = studentList.indexOf(student);
            }
        }
        if(indexToRemove > -1){
            studentList.remove(indexToRemove);

        }
    }




    /**
     * Deletes a student with a given name; middle name format
     * @param studentName
     */
    public void deleteStudent(String studentName){

        int indexToRemove = -1;

        for(Student student : studentList){
            System.out.println(student.getFullName() + "|" + studentName);
            if(student.getFullName().equals(studentName)){
                indexToRemove = studentList.indexOf(student);

            }
        }
        if(indexToRemove > -1){

            studentList.remove(indexToRemove);
        } else{
            System.out.println("Not Found");
        }

    }
    /**
     * Edits the student given an ID
     */
    public void editStudent(int studentID){
        int indexToEdit = -1;
        for(Student student : studentList){
            if(student.getStuNumber() == studentID){
                indexToEdit = studentList.indexOf(student);
            }
        }
        if(indexToEdit > -1){
            studentList.get(indexToEdit).edit();

        }
    }
    /**
     * Edits the student given a name
     */
    public void editStudent(String studentName){

        int indexToEdit = -1;

        for(Student student : studentList){
            System.out.println(student.getFullName() + "|" + studentName);
            if(student.getFullName().equals(studentName)){
                indexToEdit = studentList.indexOf(student);

            }
        }
        if(indexToEdit > -1){
            Student student = studentList.get(indexToEdit);
            student.edit();

        } else{
            System.out.println("Not Found");
        }
    }
    public void sortByGPA(){
        Student[] stuList = new Student[studentList.size()];
        for(int i = 0; i < stuList.length; i++){
            stuList[i] = studentList.get(i);
        }
        
        mergeSort(stuList,studentList.size());
        this.studentList = new ArrayList<Student>(Arrays.asList(stuList));
    }
    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while(i < left && j < right){
          
            if(l[i].getGPA() <= r[j].getGPA()){
                a[k++] = l[i++];
              
            }
            else{
                a[k++] = r[j++];
                
            }
        }
        while (i < left){ a[k++] = l[i++];}
        while (j < right) { a[k++] = r[j++];}
    }
    public static void mergeSort(Student[] a, int n){
        if(n < 2){return;}
        int mid = n/2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n-mid];
        for(int i = 0; i < mid; i++){
            l[i]=a[i];
            
        }
        for(int i = mid; i < n; i++){
            r[i-mid] = a[i];
            
        }
        mergeSort(l, mid);
        mergeSort(r,n-mid);
        merge(a, l, r, mid, n-mid);
    }
    public void sortByName(){
        Student[] stuList = new Student[studentList.size()];
        for(int i = 0; i < stuList.length; i++){
            stuList[i] = studentList.get(i);
        }
        
        mergeSortByName(stuList,studentList.size());
        this.studentList = new ArrayList<Student>(Arrays.asList(stuList));
    }
    public static int compareNames(String a, String b, int ai, int bi){
        if(ai >= a.length() || bi >= b.length()){
            //Overflow
            return 2;
        }
        if(a.charAt(ai) == ',' || a.charAt(ai) == ' '){
            return compareNames(a,b,ai+1,bi);
        }
        if(b.charAt(bi) == ',' || b.charAt(bi) == ' '){
            return compareNames(a,b,ai,bi+1);
        }
        if(a.charAt(ai) > b.charAt(bi)){
            return 0;
        }
        else if(a.charAt(ai) < b.charAt(bi)){
            return 1;
        }
        else{
            return compareNames(a,b,ai+1,bi+1);
        }
    }
    public static void mergeByName(Student[] a, Student[] l, Student[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while(i < left && j < right){
          
            if(compareNames(l[i].getFullName(),r[j].getFullName(),0,0)==0){
                a[k++] = l[i++];
              
            }
            else{
                a[k++] = r[j++];
                
            }
        }
        while (i < left){ a[k++] = l[i++];}
        while (j < right) { a[k++] = r[j++];}
    }
    public static void mergeSortByName(Student[] a, int n){
        if(n < 2){return;}
        int mid = n/2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n-mid];
        for(int i = 0; i < mid; i++){
            l[i]=a[i];
            
        }
        for(int i = mid; i < n; i++){
            r[i-mid] = a[i];
            
        }
        mergeSortByName(l, mid);
        mergeSortByName(r,n-mid);
        mergeByName(a, l, r, mid, n-mid);
    }
    public void searchByStudentID(){
        Student[] stuList = new Student[studentList.size()];
        for(int i = 0; i < stuList.length; i++){
            stuList[i] = studentList.get(i);
        }
        
        mergeSortByID(stuList,studentList.size());
        this.studentList = new ArrayList<Student>(Arrays.asList(stuList));
    }
    public int searchByIDSubsection(Student[] a, int l, int r, int dest){
        if(r-l <= 1){
            return r;
        }
        if(dest < a[(l+r)/2].getStuNumber()){
            
        }
    }
    public static int compareIDs(String a, String b, int ai, int bi){
        if(ai >= a.length() || bi >= b.length()){
            //Overflow
            return 2;
        }
        if(a.charAt(ai) == ',' || a.charAt(ai) == ' '){
            return compareNames(a,b,ai+1,bi);
        }
        if(b.charAt(bi) == ',' || b.charAt(bi) == ' '){
            return compareNames(a,b,ai,bi+1);
        }
        if(a.charAt(ai) > b.charAt(bi)){
            return 0;
        }
        else if(a.charAt(ai) < b.charAt(bi)){
            return 1;
        }
        else{
            return compareNames(a,b,ai+1,bi+1);
        }
    }
    public static void mergeByID(Student[] a, Student[] l, Student[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while(i < left && j < right){
          
            if(l[i].getStuNumber() <= r[j].getStuNumber()){
                a[k++] = l[i++];
              
            }
            else{
                a[k++] = r[j++];
                
            }
        }
        while (i < left){ a[k++] = l[i++];}
        while (j < right) { a[k++] = r[j++];}
    }
    public static void mergeSortByID(Student[] a, int n){
        if(n < 2){return;}
        int mid = n/2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n-mid];
        for(int i = 0; i < mid; i++){
            l[i]=a[i];
            
        }
        for(int i = mid; i < n; i++){
            r[i-mid] = a[i];
            
        }
        mergeSortByID(l, mid);
        mergeSortByID(r,n-mid);
        mergeByID(a, l, r, mid, n-mid);
    }





}
