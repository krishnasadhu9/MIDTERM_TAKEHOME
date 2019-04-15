package Statergy_pattern;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookLibrarian librarian = new BookLibrarian();
		
		BookInformation book1 = new BookInformation("j.k.rowling","Harry Potter series", "1995", "The adventures of Harry Potter, the Boy Who Lived, and his wand-wielding friends at the Hogwarts School of Witchcraft and Wizardry ");
		librarian.AddBook(book1);
		
		BookInformation book2 = new BookInformation("suzzane collins","The Hunger Games series","1998","In the ruins of a future North America, a young girl is picked to leave her impoverished district and travel to the decadent Capitol for a battle to the death in the savage Hunger Games.");
		librarian.AddBook(book2);
		
		BookInformation book3 = new BookInformation("Harper lee","To Kill a Mockingbird","1999","Author Harper Lee explores racial tensions in the fictional \"tired old town\" of Maycomb, Ala., through the eyes of 6-year-old Scout Finch");
		librarian.AddBook(book3);
		
		BookInformation book4 = new BookInformation("john green","The Fault in Our Stars","1789","Despite the tumor-shrinking medical miracle that has bought her a few more years, Hazel has never been anything but terminal, her final chapter inscribed upon diagnosis");
		librarian.AddBook(book4);
		
		BookInformation book5 = new BookInformation("JRR Tolkien","The Hobbit","1962","Bilbo Baggins, a respectable, well-to-do hobbit, lives comfortably in his hobbit hole until the day the wandering wizard Gandalf chooses him to take part in an adventure from which he may never return.");
		librarian.AddBook(book5);
		
		BookInformation book6 = new BookInformation("JDsalinger","The Catcher in the Rye","1895","With the author's death, the classic novel about young Holden Caulfield's disillusionment with the adult world and its \"phoniness\" will only rise in popularity — and controversy");
		librarian.AddBook(book6);
		
		BookInformation book7 = new BookInformation("JRR Tolkien","The Lord of the Rings","1993","Tolkien's seminal three-volume epic chronicles the War of the Ring, in which Frodo the hobbit and his companions set out to destroy the evil Ring of Power and restore peace to Middle-earth. ");
		librarian.AddBook(book7);
		
		BookInformation book8 = new BookInformation("Ray bradbury","Fahrenheit 451","1985","In a far future world, television dominates, and books are outlawed.");
		librarian.AddBook(book8);
		
		BookInformation book9 = new BookInformation("john green","Looking for Alaska","1967","Sixteen-year-old Miles' first year at Culver Creek Preparatory School in Alabama includes good friends and great pranks, but is defined by the search for answers about life and death after a fatal car crash.");
		librarian.AddBook(book9);
		
		BookInformation book10 = new BookInformation("Markus Zusak","The Book Thief","1932","Trying to make sense of the horrors of World War II, Death relates the story of Liesel — a young German girl whose book-stealing and storytelling talents help sustain her family and the Jewish man they are hiding, as well as their neighbors.");
		librarian.AddBook(book10);
		
		BookInformation book11 = new BookInformation("Lios Lowry","The Giver series","1956","In the future, society has eliminated discord, converting everyone to \"Sameness.\"");
		librarian.AddBook(book11);
		
		BookInformation book12 = new BookInformation("Dogulas Adams","The Hitchhiker's Guide to the Galaxy series","2003","In this collection of novels, Arthur Dent is introduced to the galaxy at large when he is rescued by an alien friend seconds before Earth's destruction, and embarks on a series of amazing adventures, from the mattress swamps of Sqornshellous Zeta to the Restaurant at the End of the Universe.");
		librarian.AddBook(book12);
		
		BookInformation book13 = new BookInformation("SE Hinton","The Outsiders","2015","S.E. Hinton was just 16 years old when she wrote this novel about kids getting caught up in class struggles. ");
		librarian.AddBook(book13);
		
		BookInformation book14 = new BookInformation("LM montgomery","Anne of Green Gables series","1989","In this collection of eight novels by Lucy Maude Montgomery, Matthew and Marilla Cuthbert, a rather prim and elderly brother and sister pair, send away for an orphan boy to help them run their farm on Canada's Prince Edward Island.");
		librarian.AddBook(book14);
		
		BookInformation book15 = new BookInformation("philip pullman","His Dark Materials series","1963","In this hit series, young Lyra Belacqua tries to prevent kidnapped children from becoming the subject of gruesome experiments; helps Will Parry — a boy from another world — search for his father;");
		librarian.AddBook(book15);
		
		BookInformation book16 = new BookInformation("stephen chbosky","The Perks of Being a Wallflower","1954","In a thought-provoking, coming-of-age novel, teenager Charlie struggles to cope with the complex world of high school. ");
		librarian.AddBook(book16);
		
		BookInformation book17 = new BookInformation("william goldman","The Princess Bride","1996","This tale of a handsome farm boy who, aided by a drunken swordsman and a gentle giant, rescues a beautiful princess named Buttercup comes with a slyly humorous, metafictional edge");
		librarian.AddBook(book17);
		
		BookInformation book18 = new BookInformation("william golding","Lord of the Flies","2012","The classic study of human nature depicts the degeneration of a group of schoolboys marooned on a desert island. ");
		librarian.AddBook(book18);
		
		BookInformation book19 = new BookInformation("vernicoroth","Divergent series","2014","In a future Chicago, 16-year-old Beatrice Prior must choose among five predetermined factions to define her identity for the rest of her life");
		librarian.AddBook(book19);
		
		BookInformation book20 = new BookInformation("john green","paper towns","2019","One month before graduating from his Central Florida high school, Quentin \"Q\" Jacobsen basks in the predictable boringness of his life, until the beautiful and exciting Margo Roth Spiegelman, Q's neighbor and classmate, takes him on a midnight adventure and then mysteriously disappears.");
		librarian.AddBook(book20);
		
		System.out.printf("Unsorted");
		librarian.printList();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("Author Sorting");
		SortBook sort_data = new SortBook("Author");
		librarian.Set_Sortbook(sort_data);
		librarian.printList();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		

		System.out.println("year of publish Sorting");
		SortBook sort_data2 = new SortBook("YearPublished");
		librarian.Set_Sortbook(sort_data2);
		librarian.printList();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		

		System.out.println("Title Sorting");
		SortBook sort_data3 = new SortBook("Title");
		librarian.Set_Sortbook(sort_data3);
		librarian.printList();
		
		
        
		
		
		

	}

}
