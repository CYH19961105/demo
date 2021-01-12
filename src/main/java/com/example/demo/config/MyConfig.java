package com.example.demo.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.config.MyErrInter;
import com.example.demo.config.MyLoginInter;

@Configuration
public class MyConfig implements WebMvcConfigurer {
	
	//拦截器配置
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
//		//需要拦截的路径，通常都是多个，所以使用数组形式
//        String[] addPathPatterns = {
//               
//        };
//        //不需要的拦截路径，同上
//        String[] excludePathPatterns = {
//           
//        };
//        //注册一个拦截器,可以将添加拦截的路径和不需要拦截的路径都写在一行上。如果有多个，就写多行
//        registry.addInterceptor(new MyLoginInter()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
//        registry.addInterceptor(new MyErrInter()).addPathPatterns("/**");
//		WebMvcConfigurer.super.addInterceptors(registry);
	}

	//资源路径映射配置
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //addResoureHandler：指的是对外暴露的访问路径
	    //addResourceLocations：指的是内部文件放置的目录	
		registry.addResourceHandler("/**")
                .addResourceLocations("classpath:templates/", "classpath:static/","file:E:/图片存储/");
        
	}
	
	//页面跳转
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {			    		
	     registry.addViewController("/500").setViewName("500");
	     registry.addViewController("/404").setViewName("404");
	     registry.addViewController("/model").setViewName("model");
	     registry.addViewController("/XXX").setViewName("XXX");
	     
	     registry.addViewController("/readBlog").setViewName("readBlog");
	     registry.addViewController("/Blogging").setViewName("Blogging");
	     WebMvcConfigurer.super.addViewControllers(registry);
	}
	
	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configurePathMatch(configurer);
	}

	//配置内容裁决的一些参数
	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureContentNegotiation(configurer);
	}

	@Override
	public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureAsyncSupport(configurer);
	}

	//默认静态资源处理器
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		/*
		 * 例如：在webroot目录下有一个图片：1.png 我们知道Servelt规范中web根目录（webroot）
		 * 下的文件可以直接访问的，但是由于DispatcherServlet配置了映射路径是：/ ，它几乎把所有 的请求都拦截了，从而导致1.png
		 * 访问不到，这时注册一个DefaultServletHttpRequestHandler
		 * 就可以解决这个问题。其实可以理解为DispatcherServlet破坏了Servlet的一个特性
		 * （根目录下的文件可以直接访问），DefaultServletHttpRequestHandler是帮助回归这个特性的。
		 */
		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addFormatters(registry);
	}
	
	//跨域
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addCorsMappings(registry);
	}

	//视图解析器
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureViewResolvers(registry);
	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addArgumentResolvers(resolvers);
	}

	@Override
	public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> handlers) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addReturnValueHandlers(handlers);
	}

	//信息转换器
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureMessageConverters(converters);
	}

	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.extendMessageConverters(converters);
	}

	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureHandlerExceptionResolvers(resolvers);
	}

	@Override
	public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.extendHandlerExceptionResolvers(resolvers);
	}

	@Override
	public Validator getValidator() {
		// TODO Auto-generated method stub
		return WebMvcConfigurer.super.getValidator();
	}

	@Override
	public MessageCodesResolver getMessageCodesResolver() {
		// TODO Auto-generated method stub
		return WebMvcConfigurer.super.getMessageCodesResolver();
	}	
	
}
