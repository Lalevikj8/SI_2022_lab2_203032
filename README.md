# Hristina Lalevikj 203032


# Control Flow Graph
![Untitled Diagram](https://user-images.githubusercontent.com/102829851/171849190-02d3e90c-1637-48a6-aa6d-752fd1bf1530.png)



# Цикломатска комплексност
За да ја добиеме цикломатската комплексност, искористив формула од дискретна математика бројот на ребра-бројот на јазли +2. Затоа за цикломатската комплексност добиваме 9.

# Тест случаи според критериумот Every statement

public class SILab2Test {
    @Test
    void exceptionTesting(){
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(Collections.emptyList()));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("&","kikche" ,"#")));
        assertEquals(Arrays.asList("1", "#", "2", "0", "3", "#", "1", "#", "#"), SILab2.function(Arrays.asList("0", "#", "0", "0", "0", "#", "0", "#", "#")));
    }

# Тест случаи според критериумот Every path
public class SILab2Test {
 @Test
    void exceptionTesting2(){
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(Collections.emptyList()));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("&","kikche" ,"#")));
        assertEquals(Arrays.asList("1", "#", "2", "0", "3", "#", "1", "#", "#"), SILab2.function(Arrays.asList("0", "#", "0", "0", "0", "#", "0", "#", "#")));
    }
# Објаснување на напишаните unit tests
За every statement поставив 3 тест примери, првиот тест пример е празна листа каде што тестот помина успешно и помина низ јазлите А B C и  W,  во вториот тест пример
како елементи на листата внесов невалидни стрингови list=("&","kikche" ,"#") и програмата фрли исклучок и помина низ јазлите  А B D EF G и W и како последен пример од овој дел ја внесов низата со елементи list=("1", "#", "2", "0", "3", "#", "1", "#", "#") при што го добив точниот резултат односно функцијата ја  врати листата list=("0", "#", "0", "0", "0", "#", "0", "#", "#"). На следната слика ги поставив сите јазли низ кои што поминале тест примерите ![image](https://user-images.githubusercontent.com/102829851/171852159-9fb7bf41-6f58-4931-af0c-40a03837ac75.png)
