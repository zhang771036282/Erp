package com.erp.controller;

import com.erp.pojo.Board;
import com.erp.service.BoardService;
import com.erp.utils.AjaxResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.border.Border;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author zph2
 * @date 2018/12/22
 */
@Controller
@RequestMapping(value = "/board/*")
public class BoardController {

    @Autowired
    private BoardService boardService;


    @RequestMapping(value="/intoBoard")
    public String page() {
        return "systemSetting/board";
    }

    @ResponseBody
    @RequestMapping(value="/saveBoard")
    public AjaxResult saveBoard(Board param) {
        int count = boardService.insertSelective(param);
        if(count == 0) {
            return AjaxResult.fail("板材编号或板材名称已经存在，请重新录入");
        }else {
            return AjaxResult.success("录入成功");
        }
    }


    @ResponseBody
    @RequestMapping(value="/updateBoard")
    public AjaxResult updateBoard(Board param) {
        int count =boardService .updateByPrimaryKeySelective(param);
        if(count == 0) {
            return AjaxResult.fail("待更新的基材不存在，请重新选择");
        }else {
            return AjaxResult.success("更新成功");
        }
    }

    @ResponseBody
    @RequestMapping(value="/deleteBoard")
    public AjaxResult deleteBoard(@RequestParam(value="id") Integer id) {
        int count = boardService.deleteByPrimaryKey(id);
        if(count > 0 ) {
            return AjaxResult.success("删除成功");
        }else {
            return AjaxResult.fail("删除失败");
        }
    }


    @ResponseBody
    @RequestMapping(value="/selectBoardList")
    public Map<String, Object> selectBoardList(@RequestParam(value="limit",defaultValue="1")Integer limit,
                                    @RequestParam(value="code") String code) {
        PageHelper.startPage(limit, 10);
        PageInfo<Border> pageInfo = new PageInfo(boardService.findBoardByCode(code));

        Map<String, Object> map = new HashMap<>();

        if (pageInfo.getList() != null && pageInfo.getList().size() > 0) {
            map.put("code", 0);
            map.put("msg", "success");
            map.put("count", pageInfo.getTotal());
            map.put("pageSize", pageInfo.getPageSize());
            map.put("pageNum", pageInfo.getPageNum());
            map.put("data", pageInfo.getList());
            return map;
        } else {
            map.put("code", 0);
            map.put("msg", "还有数据，赶紧来添加吧！！");
            map.put("count", pageInfo.getTotal());
            map.put("pageSize", pageInfo.getPageSize());
            map.put("pageNum", pageInfo.getPageNum());
            map.put("data", pageInfo.getList());
            return map;
        }
    }

}
