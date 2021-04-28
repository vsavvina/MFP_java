public class Kvadrat
{
   public double l;//атрибут, которым обладает объект этого типа - длина стороны

   public Kvadrat(double l)//конструтктор Kvadrat, который передаёт параметр l
   {
      this.l = l;
   }
   public double ploshad()
   {
      return this.l*this.l;
   }
}
