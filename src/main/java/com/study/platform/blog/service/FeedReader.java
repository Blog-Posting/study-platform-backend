package com.study.platform.blog.service;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.io.FeedException;
import com.study.platform.blog.service.dto.BlogDto;
import com.study.platform.blog.service.dto.FeedDto;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@Service
public interface FeedReader {

    BlogDto getBlog(String rssUrl) throws IOException, FeedException;

    List<FeedDto> getFeeds(URL rssUrl) throws IOException, FeedException;

    FeedDto getFeed(SyndEntry syndEntry) throws IOException, FeedException;
}
