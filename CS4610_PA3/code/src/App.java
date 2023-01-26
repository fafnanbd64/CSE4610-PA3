public class App {
    public static GSN_Model gsn = new GSN_Model();
    
    public static void main(String[] args) {
        buildGSN();
        gsn.delete_node("Sn1.1.1.2.1");
        Goal G1_1_1_2 = gsn.create_Goal("G1_1_1_2");

        Strategy S1_1_2 = gsn.create_Strategy("S1.1.2");
        gsn.create_SupportedBy(S1_1_2, G1_1_1_2);
        Goal G1_1_1_3 = gsn.create_Goal("G1.1.1.3");
        gsn.create_SupportedBy(S1_1_2, G1_1_1_3);
        gsn.delete_node("G1.1.1.1");
        Strategy s1_1_1 = gsn.create_Strategy("s1.1.1");
        Goal G1_1_1_4 = gsn.create_Goal("G1.1.1.4");
        gsn.create_SupportedBy(G1_1_1_4, s1_1_1);
        Context C1_1_1_1_2 = gsn.create_Context("C1.1.1.1.2");
        gsn.create_InContextOf(C1_1_1_1_2, G1_1_1_4);
        Justification J1_2 = gsn.create_Justification("J1.2");
        gsn.create_InContextOf(J1_2, G1_1_1_4);
        Assumption A1_1_1_2 = gsn.create_Assumption("A1.1.1.2");
        gsn.create_InContextOf(A1_1_1_2, G1_1_1_4);
        Solution S1_1_2_2 = gsn.create_Solution("S1.1.2.2");
        gsn.create_SupportedBy(S1_1_2_2, G1_1_1_4);
        PrintVisitorClient printVisitor = new PrintVisitorClient();
        printVisitor.PrintGSN(gsn.root);
    }

    public static void buildGSN() {
        gsn.root = gsn.create_Goal("G1");
        gsn.root.addDesc("Swap.c is a fault free source file");
        Goal g1_1 = gsn.create_Goal("G1.1");
        g1_1.addDesc("Fault *int temp = *a, *a=*b, *b=*b has been repaired");
        gsn.create_SupportedBy(g1_1, gsn.root);
        Strategy s1_1_1 = gsn.create_Strategy("S1.1.1");
        s1_1_1.addDesc("Consider each test case applied to fault *int temp=*a, *a=b, *b=*b");
        gsn.create_SupportedBy(s1_1_1, g1_1);
        Goal G1_1_1_1 = gsn.create_Goal("G1.1.1.1");
        G1_1_1_1.addDesc("Test Case((1,3),(3,1)) has been correctly run on the two versions of swap c related to the fault *int temp=*a, *a=b, *b=*b");
        gsn.create_SupportedBy(G1_1_1_1, s1_1_1);
        Context C1_1_1_1_1 = gsn.create_Context("C1.1.1.1.1");
        C1_1_1_1_1.addDesc("Test Case((1,3),(3,1)) is run on a script of other test cases and output of pass/fail is on one test file.");
        gsn.create_InContextOf(C1_1_1_1_1, G1_1_1_1);
        Assumption A1_1_1_1_1 = gsn.create_Assumption("A1.1.1.1.1");
        A1_1_1_1_1.addDesc("Test Case((1,3),(3,1)) is assumed to be appropriate for general fault testing");
        gsn.create_InContextOf(A1_1_1_1_1, G1_1_1_1);
        Solution Sn1_1_1_1_1 = gsn.create_Solution("Sn1.1.1.1.1");
        Sn1_1_1_1_1.addDesc("Printed output of Test Case((1,3),(3,1)) found in logged runs on the two versions of swap.c in project directory");
        gsn.create_SupportedBy(Sn1_1_1_1_1, G1_1_1_1);
        Goal G1_1_1_2 = gsn.create_Goal("G1.1.1.2");
        G1_1_1_2.addDesc("Test Case((2,6),(6,2)) has been correctly run on the two versions of swap.c related to the fault *int temp = *a, *a=*b, *b=b");
        gsn.create_SupportedBy(G1_1_1_2, s1_1_1);
        Context C1_1_1_2_1 = gsn.create_Context("C1.1.1.2.1");
        C1_1_1_2_1.addDesc("Test Case((2,6),(6,2)) is run on a script of other test cases and output of pass/fail is on one text file");
        gsn.create_InContextOf(C1_1_1_2_1, G1_1_1_2);
        Assumption A1_1_1_2_1 = gsn.create_Assumption("A1.1.1.2.1");
        A1_1_1_2_1.addDesc("Test Case((2,6),(6,2)) is assumed to be appripriate for general fault testing");
        gsn.create_InContextOf(A1_1_1_2_1, G1_1_1_2);
        Solution Sn1_1_1_2_1 = gsn.create_Solution("Sn1.1.1.2.1");
        Sn1_1_1_2_1.addDesc("Printed output of ((2,6),(6,2)) found in logged runs on the two versions of swap.c in project directory");
        gsn.create_SupportedBy(Sn1_1_1_2_1, G1_1_1_2);

    }
}
