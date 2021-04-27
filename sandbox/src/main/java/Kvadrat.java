public class Kvadrat
{
   public double l;//атрибут, которым обладает объект этого типа - длина стороны

   public Kvadrat(double l)//конструтктор Kvadrat, который передаёт параметр len
   {
      this.l = l;
   }
   public double ploshad()
   {
      return this.l*this.l;
   }
}
