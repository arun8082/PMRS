import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MentorlistComponent } from './mentorlist.component';

describe('MentorlistComponent', () => {
  let component: MentorlistComponent;
  let fixture: ComponentFixture<MentorlistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MentorlistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MentorlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
