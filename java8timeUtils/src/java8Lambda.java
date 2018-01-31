import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class java8Lambda {
    /*List<String> list = new ArrayList<>();
     list.add("a");
     list.add("b");
     list.add("c");*/
    //可修改为
    List<String> list = Stream.of("a", "b", "c", "1qwe", "123")
            .collect(toList());
    //将集合中的字符改成大写
      /*  list.stream()
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList()).forEach(a -> {
            System.out.println(a);
        });*/
    //获取到集合中的字符串中含有数字的字符串
        /*list.stream().filter(value -> Character.isDigit(value.charAt(0)))
                .forEach(value -> {
                    System.out.println(value);
                });*/

    //一个包含多个列表的流，需要获取到所有数字的序列
       /* List<? extends Serializable> collect = Stream.of(asList('a', 'a'), asList(3, 4))
                .flatMap(number -> number.stream())
                .collect(toList());*/
    //求最大值和最小值
    //查找Track对象中Length最小的对象
        /*List<Track> tracks = asList(new Track("test1", 100),
                new Track("test2", 200),
                new Track("test3", 300));
        Track track1 = tracks.stream()
                .min(Comparator.comparing(track -> track.getLength()))
                .get();

        System.out.println(track1.getLength());*/

    //reduce 实现累加
       /* Integer reduce = Stream.of(1, 2, 3).
                reduce(555, (acc, element) -> acc + element);

        System.out.println(reduce);*/
}
