package org.micah.logapi.factory;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.micah.logapi.api.IRemoteLogService;
import org.micah.model.Log;
import org.springframework.http.ResponseEntity;

/**
 * @program: eladmin-cloud
 * @description:
 * @author: Micah
 * @create: 2020-08-02 19:20
 **/
@Slf4j
public class RemoteLogFallbackFactory implements FallbackFactory<IRemoteLogService> {
    @Override
    public IRemoteLogService create(Throwable throwable) {
        log.error("插入日志失败:case{}",throwable.getCause().toString());
       return new IRemoteLogService() {
           @Override
           public ResponseEntity<Void> save(Log log, String from) {
               return null;
           }

           @Override
           public ResponseEntity<Boolean> saveLoginInfo(String username, String status, String message, String from) {
               return null;
           }
       };
    }
}
