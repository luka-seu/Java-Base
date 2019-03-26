package cn.plasticlove.test;

import cn.plasticlove.commons.ServerResponse;
import cn.plasticlove.service.ArticleService;
import cn.plasticlove.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author luka-seu
 * @description spring多线程测试
 * @create 2019-03 26-23:25
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/spring-dao.xml","classpath*:/spring/spring-thread.xml","classpath*:/spring/spring-service.xml"})
public class SpringThreadTest {
    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;
    @Autowired
    private ArticleService articleService;


    @Test
    public void test() throws ExecutionException, InterruptedException {
        Future<ServerResponse> future =  threadPoolTaskExecutor.submit(new Callable<ServerResponse>() {


            @Override
            public ServerResponse call() throws Exception {
                System.out.println(Thread.currentThread().getName());
                return articleService.getArticleList(1,10);

            }
        });



        ServerResponse serverResponse = future.get();
        System.out.println(Thread.currentThread().getName());
        System.out.println(serverResponse);
    }
}
