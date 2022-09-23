class Teacher{
   public void teach(){
        System.out.println("teaching subjects");
}

}
class student extends Teacher{
   void listening(){
             System.out.println("Listenning to teacher");
}
    public static void main(String[] args){
            student s=new student();
            s.teach();
            s.listenning();
}
}