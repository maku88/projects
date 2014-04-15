package pl.maku.angular.backend;

import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Maciek
 * Date: 15.04.14
 * Time: 22:56
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/tags")
public class TagService {

    Map<String, Tag> tagMap = new HashMap<>();

    public TagService() {
        tagMap.put("ABC",new Tag("ABC","nazwa 1","opis 1"));
        tagMap.put("DEF", new Tag("DEF", "nazwa 2", "opis 2"));
        tagMap.put("GHI", new Tag("GHI", "nazwa 3", "opis 3"));
        tagMap.put("JKL",new Tag("JKL","nazwa 4","opis 4"));
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Tag> getTags() {
        ArrayList<Tag> tags = new ArrayList<Tag>();
        tags.addAll(tagMap.values());
        return tags;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{tagID}")
    public @ResponseBody Tag getTag(@PathVariable("tagID") String tagID) {
        return tagMap.get(tagID);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{tagID}")
    public @ResponseBody Tag deleteTag(@PathVariable("tagID") String tagID) {
        return tagMap.remove(tagID);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody void deleteTag(Tag tag) {
        System.out.println("Adding tag : " + tag.toString());
        tagMap.put(tag.getId(),tag);
    }

}
