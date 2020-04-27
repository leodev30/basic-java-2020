public class Student implements Comparable<Student> {
    int msv;
    String hoTen;
    Student(int msv, String hoTen) {
        this.msv = msv;
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return "Student{" +
                "msv=" + msv +
                ", hoTen='" + hoTen + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return (this.msv == ((Student) o).msv) ? true : false ;
    }

    @Override
    public int compareTo(Student o) {
        if (this.msv > o.msv){
                    return -1;
                }
                else if(this.msv < o.msv){
                    return 1;
                } else return 0;
    }
}
