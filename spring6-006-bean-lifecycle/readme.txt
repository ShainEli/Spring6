Bean的生命周期五步：
 * 第一步：实例化Bean(无参数构造方法)
 * 第二步：给Bean属性赋值(调用set方法)
 * 第三步：初始化Bean(调用Bean的init方法。注意：init方法需要自己处理)
 * 第四步：使用Bean
 * 第五步：销毁Bean(调用Bean的destroy方法。注意：destroy方法需要自己处理)

Bean的生命周期七步：
  * 第一步：实例化Bean(无参数构造方法)
  * 第二步：给Bean属性赋值(调用set方法)
  * 第三步：执行“Bean后处理器”的before方法
  * 第四步：初始化Bean(调用Bean的init方法。注意：init方法需要自己处理)
  * 第五步：执行“Bean后处理器”的after方法
  * 第六步：使用Bean
  * 第七步：销毁Bean(调用Bean的destroy方法。注意：destroy方法需要自己处理)

Bean的生命周期十步：
  * 第一步：实例化Bean
  * 第二步：给Bean属性赋值
  * 第三步：检查Bean是否实现了Aware的相关接口，并设置相关依赖
  * 第四步：执行“Bean后处理器”的before方法
  * 第五步：检查Bean是否实现了InitializingBean接口，并调用接口方法
  * 第六步：初始化Bean
  * 第七步：执行“Bean后处理器”的after方法
  * 第八步：使用Bean
  * 第九步：检查Bean是否实现了DisposableBean接口，并调用接口方法
  * 第十步：销毁Bean