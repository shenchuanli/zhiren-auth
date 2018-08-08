//package cn.zhiren.auth.serviceImpl;
//
//import cn.zhiren.auth.config.ZhiRenConfig;
//import cn.zhiren.auth.dto.DemoDTO;
//import cn.zhiren.auth.mapper.DemoMapper;
//import cn.zhiren.auth.po.Demo;
//import cn.zhiren.auth.service.DemoService;
//import org.modelmapper.ModelMapper;
//import org.modelmapper.TypeToken;
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.CacheEvict;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.Random;
//import java.util.Set;
//import java.util.TreeSet;
//import java.util.stream.Collectors;
//
//
//@Service(value = "demo")
//@Transactional
//public class DemoServiceImpl implements DemoService {
//
//    @Autowired
//    private AmqpTemplate amqpTemplate;
// //key：消息名称；content：消息内容
//     public void send(String key,String content) {
//         amqpTemplate.convertAndSend(key, content);
//     }
//
//    @Autowired
//    private DemoMapper demoMapper;
//
//    @Autowired
//    private ZhiRenConfig zhiRenConfig;
//
//    @Autowired
//    RedisTemplate<?, ?> redisTemplate;
//
//    @Override
//    @CacheEvict(value = "getDemos",allEntries=true)
//    public boolean setDemo(DemoDTO dto) {
//        Set<Integer> aa = new TreeSet();
//        send("queues1","auth hahhahah");
//        Random random = new Random(100);
//        ModelMapper modelMapper = new ModelMapper();
//        Demo demo = modelMapper.map(dto, new TypeToken<Demo>() {
//        }.getType());
//        demo.setId(random.nextInt(1000));
//        demoMapper.insert(demo);
//        return true;
//    }
//
//    @Override
//    @CacheEvict(value = "getDemos",allEntries=true)
//    public boolean updateDemo(DemoDTO dto) {
//        List<Demo> demos = demoMapper.selectByCode(dto.getCode());
//        for (Demo demo:demos) {
//            demo.setName(dto.getName());
//        }
//        int result = demoMapper.updateBatch(demos);
//        System.out.println(result);
//        return true;
//    }
//
//    @Override
//    @CacheEvict(value = "getDemos",allEntries=true)
//    public boolean deleteDemo(String code) {
//        demoMapper.deleteByCode(code);
//        return true;
//    }
//
//    @Override
//    @Cacheable(value = "getDemos")
//    public List<DemoDTO> getDemos(String name) {
//        List<Demo> demos = demoMapper.selectAll();
//        List<Demo> dtos = demos.stream().filter(x -> x.getName().equals(name)).collect(Collectors.toList());
//        ModelMapper modelMapper = new ModelMapper();
//        List<DemoDTO> demoDTOS = modelMapper.map(dtos, new TypeToken<List<DemoDTO>>() {
//        }.getType());
//        for (DemoDTO dto : demoDTOS) {
//            System.out.println(dto);
//        }
//        return demoDTOS;
//    }
//}
