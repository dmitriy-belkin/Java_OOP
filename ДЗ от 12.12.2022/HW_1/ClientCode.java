package HW_1;

import HW_1.FamilyTree.Type;

public class ClientCode {
  public static void main(String[] args) {

    var dmitriy = new FamilyMember("Дмитрий Белкин");
    var daria = new FamilyMember("Дарья Белкина");
    var michael = new FamilyMember("Майкл Белкин");
    var ivetta = new FamilyMember("Иветта Ким");
    var alexander = new FamilyMember("Александр Белкин");

    FamilyTree familytree = new FamilyTree();

    familytree.addNode(dmitriy, Type.spouse, daria);
    familytree.addNode(michael, Type.son, daria);
    familytree.addNode(ivetta, Type.daughter, daria);
    familytree.addNode(alexander, Type.daughter, daria);

    LearningTree child = new LearningTree(familytree);
    System.out.println(Conclusion.Member(child.findAll(daria, Type.son)) + (char) 27 + "[33m");
    System.out.println(Conclusion.Member(child.findAll(daria, Type.daughter)) + (char) 27 + "[35m");
  }
}