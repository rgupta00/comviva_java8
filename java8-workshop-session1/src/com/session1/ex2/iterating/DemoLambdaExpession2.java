package com.session1.ex2.iterating;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class DemoLambdaExpession2 {

	
	public static void main(String[] args) {
		
		List<Book> books=Arrays.asList
				(new Book(121, "java", "raj", 240),
						new Book(11, "python", "ekta", 840)
						,new Book(19 ,"thinking in java", "bruce", 740),
						new Book(621, "c programming", "gunika", 300));
		
		//get name of all the books which are costly 500 and sorted as per author
		//let sort the book
		
		//Predicate<Book> p1=b-> b.getPrice()>=500;	//lamabda vs Method ref :: it is syn suger
		
		Predicate<Book> p1=Book::isCostlyBook;
		
		
//		books.stream()
//		.filter(Book::isCostlyBook)
//		.sorted(Comparator.comparing(Book::getPrice).reversed())
//		.map(Book::getTitle)
//		.forEach(bookName-> System.out.println(bookName));
		
		List<String>booksName = books.stream()
		.filter(Book::isCostlyBook)// predicate
		.sorted(Comparator.comparing(Book::getPrice).reversed())// Comarator
		.map(Book::getTitle)//transformation
		.collect(Collectors.toList());//terminal op
		
		booksName
		.stream().forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Collections.sort(books, new Comparator<Book>() {
//
//			@Override
//			public int compare(Book o1, Book o2) {
//				return Double.compare(o2.getPrice(), o1.getPrice());
//			}
//		});
//		
//		List<Book> costlyBooks=new ArrayList<>();
//		for(Book b: books) {
//			if(b.getPrice()>=500) {
//				costlyBooks.add(b);
//			}
//		}
//		
//		
//		
//		List<String> costlyBooksName=new ArrayList<>();
//		for(Book b: costlyBooks) {
//			costlyBooksName.add(b.getTitle());
//		}
//		
//		for(String bName: costlyBooksName) {
//			System.out.println(bName);
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Predicate<Book> costlyBookPredicate= book->book.getPrice()>500;
//		
//		System.out.println(costlyBookPredicate.test(new Book(11, "rich dad poor dad", "RK", 300)));
//		
//		Comparator<Book> comparator=( o1,  o2)-> Double.compare(o2.getPrice(), o1.getPrice());
			
//		Collections.sort(books, ( o1,  o2)-> Double.compare(o2.getPrice(), o1.getPrice()));
		
		//Collections.sort(books, Comparator.comparing(Book::getPrice).reversed());
		
	}
}
