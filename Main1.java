void main() {
    Scanner scanner = new Scanner(System.in);

    List<String> cities = Arrays.asList(
            "Москва", "Париж", "Лондон", "Токио",
            "Москва", "Нью-Йорк", "Берлин", "Рим",
            "Владивосток", "Лондон", "Санкт-Петербург"
    );

    cities.stream().forEach(System.out::println);

    cities.stream().filter(city -> city.length() > 6).
            forEach(System.out::println);

    System.out.print("\nВведите название города для подсчета: ");
    String userCity = scanner.nextLine();

    System.out.print("Введите начальную букву для подсчета: ");
    String userLetter = scanner.next();

    long cityCount = cities.stream().
            filter(city -> city.equalsIgnoreCase(userCity)).
            count();

    long letterCount = cities.stream().
            filter(city -> city.startsWith(userLetter)).
            count();

    System.out.println("Город \"" + userCity + "\" встречается раз: " + cityCount);
    System.out.println("Городов на букву \"" + userLetter + "\": " + letterCount);
}