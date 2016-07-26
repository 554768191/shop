package wl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import wl.dao.AhrecordMapper;
import wl.dao.SApplyTeacherMapper;
import wl.dao.SApplyTrainMapper;
import wl.dao.SBossMapper;
import wl.dao.SShopMapper;
import wl.pojo.Ahrecord;
import wl.pojo.SApplyTeacher;
import wl.pojo.SApplyTrain;
import wl.pojo.SBoss;
import wl.pojo.SShop;
import wl.service.ISApplyService;
import wl.tools.Assert;
import wl.tools.BaseInfo;
@Service("/sapply")
public class SApplyServiceImpl implements ISApplyService {
	@Resource
	private SApplyTeacherMapper applyTeacherDao;
	@Resource
	private SApplyTrainMapper applyTrainDao;
	@Resource
	private SShopMapper shopDao;
	@Resource
	private SBossMapper bossDao;
	@Resource
	private AhrecordMapper ahRecordDao;
	@Override
	public JSONObject addOneTeacherApply(int sShopId,int sBossId,String reason,
			String count) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(sShopId) && !Assert.isNullOrEmpty(sBossId) &&
				!Assert.isNullOrEmpty(reason) && !Assert.isNullOrEmpty(count)){
			SShop shop = this.shopDao.selectByPrimaryKey(sShopId);
			SBoss boss = this.bossDao.selectByPrimaryKey(sBossId);
			if(!Assert.isNullOrEmpty(shop) && !Assert.isNullOrEmpty(boss)){
				SApplyTeacher applyTeacher = new SApplyTeacher();
				applyTeacher.setsShopId(sShopId);
				applyTeacher.setsShopName(shop.getName());
				applyTeacher.setsBossId(sBossId);
				applyTeacher.setsBossName(boss.getName());
				applyTeacher.setReason(reason);
				applyTeacher.setCount(count);
				applyTeacher.setDeptId(8);
				applyTeacher.setStatus(0);
				applyTeacher.setStep(1);
				this.applyTeacherDao.insertSelective(applyTeacher);
				
				Ahrecord ahRecord = new Ahrecord();
				ahRecord.setUserId(sBossId);
				ahRecord.setAhId(applyTeacher.getId());
				ahRecord.setStatus(0);
				ahRecord.setType(10);
				this.ahRecordDao.insertSelective(ahRecord);
				obj.put("success", BaseInfo.getInfo("SUCCESS_ADD_TEACHERAPPLY"));
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject addOneTrainApply(int sShopId,int sBossId,String theme,
			String count) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(sShopId) && !Assert.isNullOrEmpty(sBossId) &&
				!Assert.isNullOrEmpty(theme) && !Assert.isNullOrEmpty(count)){
			SShop shop = this.shopDao.selectByPrimaryKey(sShopId);
			SBoss boss = this.bossDao.selectByPrimaryKey(sBossId);
			if(!Assert.isNullOrEmpty(shop) && !Assert.isNullOrEmpty(boss)){
				SApplyTrain applyTrain = new SApplyTrain();
				applyTrain.setsShopId(sShopId);
				applyTrain.setsShopName(shop.getName());
				applyTrain.setsBossId(sBossId);
				applyTrain.setsBossName(boss.getName());
				applyTrain.setTheme(theme);
				applyTrain.setCount(count);
				applyTrain.setDeptId(8);
				applyTrain.setStatus(0);
				applyTrain.setStep(1);
				this.applyTrainDao.insertSelective(applyTrain);
				
				Ahrecord ahRecord = new Ahrecord();
				ahRecord.setUserId(sBossId);
				ahRecord.setAhId(applyTrain.getId());
				ahRecord.setStatus(0);
				ahRecord.setType(10);
				this.ahRecordDao.insertSelective(ahRecord);
				obj.put("success", BaseInfo.getInfo("SUCCESS_ADD_TRAINAPPLY"));
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject myTeacherApply(int sShopId) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
			if(!Assert.isNullOrEmpty(shopDao)){
				SShop shop = this.shopDao.selectByPrimaryKey(sShopId);
				if(!Assert.isNullOrEmpty(shop)){
					List<SApplyTeacher> applyTeacherList = this.applyTeacherDao.selectByShopId(sShopId);
					obj.put("applyTeacherList", applyTeacherList);
				}else{
					obj.put("error", BaseInfo.getInfo("ERROR_FF"));
				}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject myTrainApply(int sShopId) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
			if(!Assert.isNullOrEmpty(shopDao)){
				SShop shop = this.shopDao.selectByPrimaryKey(sShopId);
				if(!Assert.isNullOrEmpty(shop)){
					List<SApplyTrain> applyTrainList = this.applyTrainDao.selectByShopId(sShopId);
					obj.put("applyTrainList", applyTrainList);
				}else{
					obj.put("error", BaseInfo.getInfo("ERROR_FF"));
				}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject myTeacherApplyDetil(int id) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(id)){
			SApplyTeacher applyTeacher = this.applyTeacherDao.selectByPrimaryKey(id);
			if(!Assert.isNullOrEmpty(applyTeacher)){
				obj.put("applyTeacher", applyTeacher);
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject myTrainApplyDetil(int id) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(id)){
			SApplyTrain applyTrain = this.applyTrainDao.selectByPrimaryKey(id);
			if(!Assert.isNullOrEmpty(applyTrain)){
				obj.put("applyTrain", applyTrain);
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

}
