package com.rodriguemouadeu.javacert.associate.mock.enthuware;

class Mock4Q33 {
    void probe(int... x) { System.out.println("In ..."); }  //1
    
    void probe(Integer x) { System.out.println("In Integer"); } //2
    
    void probe(long x) { System.out.println("In long"); } //3 
    
    void probe(Long x) { System.out.println("In LONG"); } //4
    
    public static void main(String[] args){
        Integer a = 4; new Mock4Q33().probe(a); //5
        long b = 4L; new Mock4Q33().probe(b); //6
    }
}

