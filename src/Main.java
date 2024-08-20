public class Main {
    public static void main( String[] args ) {
    CreditPaymentService percentCalc = new CreditPaymentService();
    double total = percentCalc.calculate( 12, 9.99, 1_000_000 );
    System.out.println( "Ежемесячный платёж, срок кредита  1 год: " + ( int )total + " рублей" );

    total = percentCalc.calculate( 24, 9.99, 1_000_000 );
    System.out.println( "Ежемесячный платёж, срок кредита 2 года: " + ( int )total + " рублей");

    total = percentCalc.calculate( 36, 9.99, 1_000_000 );
    System.out.println( "Ежемесячный платёж, срок кредита 3 года: " + ( int )total + " рублей" );
    }
}

