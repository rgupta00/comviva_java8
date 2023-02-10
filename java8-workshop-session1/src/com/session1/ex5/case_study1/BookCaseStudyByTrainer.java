package com.session1.ex5.case_study1;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class BookCaseStudyByTrainer {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		//0. show all the books
		//allBooks.forEach(b-> System.out.println(b));
		
		// 1. Find books with more then 400 pages
		
//		List<Book> booksMoreThen400Pages= allBooks
//				.stream()
//				.filter(b-> b.getPages()>400)
//				.collect(Collectors.toList());
//		booksMoreThen400Pages.forEach(b-> System.out.println(b));
		
				
		// 2. Find all books that are java books and more then 400 pages
		
//		Predicate<Book> moreThen400PagePredicate= b-> b.getPages()>400;
//
//		Predicate<Book> javaBookPredicate= b-> b.getSubject()==Subject.JAVA;
//		
//		
//		List<Book> booksMoreThen400PagesAndJavaBooks= allBooks
//				.stream()
//				.filter(moreThen400PagePredicate.and(javaBookPredicate))
//				.collect(Collectors.toList());
		
	
		// 3. We need the top three longest books
//		List<Book> top3LongestBook= allBooks
//		.stream()
//		.sorted(Comparator.comparing(Book::getPages).reversed())
//		//.skip(1)
//		.limit(3)
//		.collect(Collectors.toList());
		
		
	
		// 4. We need from the fourth to the last longest books
//		List<Book> form4toLastLongestBook= allBooks
//				.stream()
//				.sorted(Comparator.comparing(Book::getPages).reversed())
//				.skip(3)
//				
//				.collect(Collectors.toList());

		// 5. We need to get all the publishing years
//		List<Integer> getAllYears= allBooks
//		.stream()
//		.map(b->b.getYear())
//		.distinct()
//		.collect(Collectors.toList());
		
		//6. get the name of all books in comma sep way
//		
//		String nameOfAllBooks= allBooks
//				.stream()
//				.map(b->b.getTitle())
//				.distinct()
//				.collect(Collectors.joining(","));
//		
//		System.out.println(nameOfAllBooks);
		
		
		//5 b. print all author names
		
//		Stream<Stream<Author>> map = allBooks.stream().map(b->b.getAuthors().stream());
		
//				 Set<Author> collect = allBooks.stream()
//				 .flatMap(b->b.getAuthors().stream())
//				 .collect(Collectors.toSet());
				 

		 
//		 List<String> names = allBooks.stream()
//				 .flatMap(b->b.getAuthors().stream())
//				 .sorted(Comparator.comparing(Author::getLastname))
//				 .map(a->a.getName())
//				 .distinct()
//				 .collect(Collectors.toList());
//		 
//		 names.forEach(name-> System.out.println(name));
		
		String names = allBooks.stream()
				 .flatMap(b->b.getAuthors().stream())
				 .sorted(Comparator.comparing(Author::getLastname))
				 .map(a->a.getName())
				 .distinct()
				 .collect(Collectors.joining(","));
		 
		System.out.println(names);
		 
		 
		// We need all the origin countries of the authors
		//What i have : list of books
		//List<Book>---> List<Author>-->LIst<String> --->
		
		
		
		
		// 6. We need all the authors names who have written a book		
		
		
		

		// We want the most recent published book SQL, Optional 
//		Optional<Book> opBook = allBooks
//		.stream()
//		.min(Comparator.comparingInt(Book::getYear));
//	
//		
//		System.out.println(opBook.map(b->b.getTitle()).orElse("no book found"));
		// We want to know if all the books are written by more than one author
	
		// We want one of the books written by more than one author. (findAny)
		
//		Optional<Book> opBooks = allBooks.stream()
//		.filter(b->b.getAuthors().size()>1)
//		.findAny();
//		
//		System.out.println(opBooks.orElseThrow(()-> new BookNotFoundEx()));
		
		
		
		// We want the total number of pages published
		
		//reduction
	
		// We want to know how many pages the longest book has.

	
		// We want the average number of pages of the books
	
		// We want all the titles of the books

	
		// We want the book with the higher number of authors?

	
		// We want a Map of book per year.

		Map<Integer, List<Book>> bookPerYearMap = allBooks.stream()
		.collect(Collectors.groupingBy(Book::getYear));
		

		bookPerYearMap.forEach(( year,books)-> System.out.println(year+": "+books));
		
		// We want to count how many books are published per year.
		//Map<Integer,Integer> map
	

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		
		List<Author> authors1 = Arrays.asList
				(new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in"));

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(
				new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));

		books.add(new Book("java", authors1, 400, Subject.JAVA, 2000, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("Mgt", authors3, 600, Subject.DOT_NET, 2000, "1293"));

		return books;
	}

}
