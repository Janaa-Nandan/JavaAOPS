package JavaAOPS.SaturdayAssignmentWeek1;

import java.util.ArrayList;
import java.util.HashMap;
public class ProteinTranslation {
    static HashMap<String, String> proteins = new HashMap<>();
    static int j = 0;
    public static void main(String[] args) {
        proteins.put("AUG", "Methionine");
        proteins.put("UUU", "Phenylalanine");
        proteins.put("UUC", "Phenylalanine");
        proteins.put("UUA", "Leucine");
        proteins.put("UUG", "Leucine");
        proteins.put("UCU", "Serine");
        proteins.put("UCC", "Serine");
        proteins.put("UCA", "Serine");
        proteins.put("UCG", "Serine");
        proteins.put("UAU", "Tyrosine");
        proteins.put("UAC", "Tyrosine");
        proteins.put("UGU", "Cysteine");
        proteins.put("UGC", "Cysteine");
        proteins.put("UGG", "Tryptophan");
        System.out.println(protein_converter("AUGUUUUCUUAAAUG"));
    }
    public static ArrayList<String> protein_converter(String RNA){
        ArrayList<String> Protein = new ArrayList<>();
        for(int i = 0; i < RNA.length()/3;i++){
            String codon = RNA.substring(j,j+3);
            if (codon.equals("UAA") | codon.equals("UAG") | codon.equals("UGA")){
                break;
            }
            System.out.println("test");
            Protein.add(i,codon);
            j+=3;
        }
        return Protein;
    }
}
