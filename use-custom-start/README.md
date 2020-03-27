mvn package
docker build -t use-custom-service:1.0.1 .
docker run --rm -ti -p 本地端口:镜像服务端口 镜像名:版本号
    docker run --rm -ti -p 8090:8080 use-custom-service:1.0.1 
    
docker images -> 查询[ImageId] 15f7d3c8a063
sudo docker tag [ImageId] registry.cn-hangzhou.aliyuncs.com/sonicmoving/chen-debug-service:[镜像版本号]
    sudo docker tag 16532a126e7c registry.cn-hangzhou.aliyuncs.com/sonicmoving/chen-debug-service:1.0.1
sudo docker push registry.cn-hangzhou.aliyuncs.com/sonicmoving/chen-debug-service:1.0.1   