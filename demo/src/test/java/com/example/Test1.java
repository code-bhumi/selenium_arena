package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 
{

    @Test
    public void regular()
    {    
    ArrayList<String> names = new ArrayList<String>();
    names.add("Adwita");
    names.add("Atharv");
    names.add("Ram");
    names.add("Aisha");
    names.add("Sheen");
    names.add("Aarvika");
    int count=0;

    for(int i=0;i<names.size();i++)
    {
        String actual = names.get(i);
        if(actual.startsWith("A"))
        {
            count++;
        }
    }    
    System.out.println(count);
    }

    @Test
    public void StreamFilter()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Adwita");
        names.add("Atharv");
        names.add("Ram");
        names.add("Aisha");
        names.add("Sheen");
        names.add("Aarvika");

        Long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);

        long d = Stream.of("Adwita", "Atharv", "Ram", "Aisha", "Sheen", "Aarvika").filter(s ->
        {
            s.startsWith("A");
            return true;
        }).count();
        System.out.println(d);

        names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
        names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));



    }
   
    @Test
    public void streamMap()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Baby");
        names.add("Boy");
        names.add("Girl");
        // print name which have last letter "a" with uppercase
        Stream.of("Adwita", "Atharv", "Ram", "Aisha", "Sheen", "Aarvika").filter(s->s.endsWith("a"))
        .map(s->s.toUpperCase()).forEach(s->System.out.println(s));

        // print names with first letter as "a" with uppercase and sorted

        List<String>names1 = Arrays.asList("Adwita", "Atharv", "Ram", "Aisha", "Sheen", "Aarvika");
        names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

        // merging two list
        Stream<String> newStream = Stream.concat(names.stream(),names1.stream());
        //newStream.sorted().forEach(s->System.out.println(s));   (commented for below)

        boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Aisha"));
        System.out.println(flag);
        Assert.assertTrue(flag);

    }

    @Test
    public void streamCollect()
    {
        List<String> ls = Stream.of("Adwita", "Atharv", "Ram", "Aisha", "Sheen", "Aarvika").filter(s->s.endsWith("a")).map(s->s.toLowerCase())
        .collect(Collectors.toList());
        System.out.println(ls.get(0));

        List<Integer>values = Arrays.asList(3,2,2,7,5,1,9,7);

        //print unique numbers from this list 
        // sort the array print the third index

        values.stream().distinct().forEach(s->System.out.println(s));
        List<Integer>li = values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(li.get(2));

    }


}   
