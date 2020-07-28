import redis.clients.jedis.Jedis;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-31 19:24
 */
public class RedisDemo000 {
    public static void main(String[] args) {

    Jedis jedis=new Jedis("localhost");
    jedis.set("name","wugengen");
    System.out.println(jedis.);
    System.out.println(jedis.get("name"));
    }

}
